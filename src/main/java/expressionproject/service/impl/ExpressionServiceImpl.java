package expressionproject.service.impl;

import expressionproject.bean.Expression;
import expressionproject.exeptions.DevisionByZeroException;
import expressionproject.service.ExpressionService;

import javax.jws.WebService;

@WebService(endpointInterface = "expressionproject.service.ExpressionService", serviceName = "expressionService")
public class ExpressionServiceImpl implements ExpressionService {

    public double calculate(Expression expression) throws DevisionByZeroException {
        if (expression.getOperation().equals("+")) {
            return expression.getNumber1() + expression.getNumber2();
        } else if (expression.getOperation().equals("-")) {
            return expression.getNumber1() - expression.getNumber2();
        } else if (expression.getOperation().equals("*")) {
            return expression.getNumber1() * expression.getNumber2();
        } else if (expression.getOperation().equals("/")) {
            return expression.getNumber1() / expression.getNumber2();
        } else {
            throw new DevisionByZeroException("Division by 0 is forbidden");
        }
    }
}
