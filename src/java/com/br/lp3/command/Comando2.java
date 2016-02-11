package com.br.lp3.command;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author 31338283
 */
public class Comando2 implements Command {

    private HttpServletRequest request;

    @Override
    public void execute() {
        request.getSession().setAttribute("teste", "2");
    }

    @Override
    public void init(HttpServletRequest request) {
        this.request = request;
    }

    @Override
    public String getReturnPage() {
        return "pagina1.jsp";
    }

}
