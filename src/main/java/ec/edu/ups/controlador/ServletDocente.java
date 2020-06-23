package ec.edu.ups.controlador;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.DocenteDAO;
import ec.edu.ups.entidad.Docente;
import ec.edu.ups.entidad.ReciboDePago;
import ec.edu.ups.entidad.Titulo;

/**
 * Servlet implementation class ServletDocente
 */
@WebServlet("/ServletDocente")
public class ServletDocente extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Date fec;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDocente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		DocenteDAO docentedao =DAOFactory.getFactory().getDocenteDAO();
		

		SimpleDateFormat formato = new SimpleDateFormat("yyy/MM/dd");
		 try {
			fec = formato.parse("2024/01/23");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 List<Titulo> titulos= new ArrayList<Titulo>();
		 List<ReciboDePago> recibos= new ArrayList<ReciboDePago>();
		 Titulo titulo1= new Titulo("Ingeniero en Sistemas","1998",null);
		 ReciboDePago recibo1= new ReciboDePago(fec,2000.0,null);
		 Docente docente1 = new Docente(250.00, fec,null , null);
		 titulo1.setDocente(docente1);
		 recibo1.setDocente(docente1);
		 titulos.add(titulo1);
		 recibos.add(recibo1);
		 docente1.setTitulos(titulos);
		 docente1.setRecibosDePagos(recibos);
		 docentedao.create(docente1);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
