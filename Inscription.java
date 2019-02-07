import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Inscription extends HttpServlet {
    public static final String VUE = "/WEB-INF/inscription.jsp";
	
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
        /* Affichage de la page d'inscription */
        this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
	
    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
        /* Traitement des données du formulaire */
    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
        /* Récupération des champs du formulaire. */
        String email = request.getParameter( CHAMP_EMAIL );
        String motDePasse = request.getParameter( CHAMP_PASS );
        String confirmation = request.getParameter( CHAMP_CONF );
        String nom = request.getParameter( CHAMP_NOM );

        try {
            validationEmail( email );
            validationMotsDePasse( motDePasse, confirmation );
            validationNom( nom );
        } catch (Exception e) {
            /* Gérer les erreurs de validation ici. */
        }
    }

    private void validationEmail( String email ) throws Exception{}
    private void validationMotsDePasse( String motDePasse, String confirmation ) throws Exception{}
    private void validationNom( String nom ) throws Exception{}
}
