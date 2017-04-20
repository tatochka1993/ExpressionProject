package expressionproject.service;

import expressionproject.bean.Expression;
import expressionproject.exeptions.DevisionByZeroException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface ExpressionService {

    @WebMethod
    @WebResult(name = "result")
    double calculate(@WebParam(name = "expression") Expression expression) throws DevisionByZeroException;

}
