package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Race;

/**
 * Servlet implementation class RaceServlet
 */
@WebServlet("/RaceServlet")
public class RaceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Race r = new Race();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RaceServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpSservletRequest request,
	 * HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 文字コード設定
		request.setCharacterEncoding("utf-8");

		ArrayList<String> race = new ArrayList<String>();
		race = r.returnRace();

		request.setAttribute("race", race);


		/*
		if (request.getParameter("flg") == null || request.getParameter("flg").equals("true")) {

		} else{
			// counterが5になったときに1回休み、2分の1の確率で復活
			if (counter % 5 != 0) {
				ElectricCar ec = new ElectricCar();
				etext += ec.getSpeed();
			} else {
				eRest_flag = true;
			}
			if (counter % 5 != 0 && eRest_flag) {
				if (Math.random() <= 0.5)
					eRest_flag = !eRest_flag;
			}
			request.setAttribute("etext", etext + "E");

			// couterが3になったときに1回休み、10分の3の確率で2.5倍の速さ
			if (counter % 3 != 0) {
				Bus b = new Bus();
				if (Math.random() <= (10 / 3)) {
					btext += "＊＊＊＊＊";
				} else {
					btext += b.getSpeed();
				}
			}
			request.setAttribute("btext", btext + "B");

			// 2分の1の確率で休み、5分の1の確率で1.5倍の速さ
			if (Math.random() <= 0.5) {
				if (Math.random() <= 0.2) {
					stext += "＝＝＝＝＝＝";
				} else {
					SuperCar sc = new SuperCar();
					stext += sc.getSpeed();
				}
			}
			request.setAttribute("stext", stext + "S");

			// カウントアップ
			counter++;
*/
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
