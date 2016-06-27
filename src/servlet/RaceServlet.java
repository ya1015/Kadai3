package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Bus;
import beans.ElectricCar;
import beans.SuperCar;

/**
 * Servlet implementation class RaceServlet
 */
@WebServlet("/RaceServlet")
public class RaceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/** 電気自動車の走行を表す文字列 */
	private static String etext = "";
	/** バスの走行を表す文字列 */
	private static String btext = "";
	/** スーパーカーの走行を表す文字列 */
	private static String stext = "";
	/** F5を押された回数を数えるカウンター */
	private static int counter;
	
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RaceServlet() {
		super();
	}

	/**
S	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 文字コード設定
		request.setCharacterEncoding("utf-8");
		
			ElectricCar ec = new ElectricCar();
			etext += ec.getSpeed();
			request.setAttribute("etext", etext + "E");

			Bus b = new Bus();
			btext += b.getSpeed();
			request.setAttribute("btext", btext + "B");

			SuperCar sc = new SuperCar();
			stext += sc.getSpeed();
			request.setAttribute("stext", stext + "S");
		
		
		request.getRequestDispatcher("output.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

}
