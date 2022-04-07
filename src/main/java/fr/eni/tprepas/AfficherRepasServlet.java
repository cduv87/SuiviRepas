package fr.eni.tprepas;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.tprepas.bll.RepasManager;
import fr.eni.tprepas.bo.Ingredients;
import fr.eni.tprepas.bo.Repas;

/**
 * Servlet implementation class AfficherRepasServlet
 */
@WebServlet("/AfficherRepas")
public class AfficherRepasServlet extends HttpServlet {
	private RepasManager repasManager = new RepasManager();
	List<Repas> listeRepas = new ArrayList<Repas>();
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		System.out.println(listeRepas); //TEST
		
		if ((request.getParameter("detail")) != null) {
			Integer id = Integer.parseInt(request.getParameter("detail"));
			Ingredients ingredients = new Ingredients();
			ingredients.setListeIngredients(repasManager.GetIngredientsFromIdRepas(id));
			for(Repas e : listeRepas) {
				if (e.getId() == id) {
					e.setCondition(true);
					e.setIngredients(ingredients);
				}
			}
		}
		if ((request.getParameter("reduire")) != null) {
			Integer id = Integer.parseInt(request.getParameter("reduire"));
			for(Repas e : listeRepas) {
				if (e.getId() == id) {
					e.setIngredients(null);
					e.setCondition(false);
				}
			}
		}
		
	request.setAttribute("listeRepas", listeRepas);

	request.getRequestDispatcher("/WEB-INF/AfficherRepas.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


	}
	
	@Override
	public void init() throws ServletException {
		listeRepas = repasManager.GetRepas();
	}

}
