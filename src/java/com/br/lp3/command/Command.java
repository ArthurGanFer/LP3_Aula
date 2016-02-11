package com.br.lp3.command;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author 31338283
 */
public interface Command {

    public void execute();

    public void init(HttpServletRequest request);

    public String getReturnPage();
}
