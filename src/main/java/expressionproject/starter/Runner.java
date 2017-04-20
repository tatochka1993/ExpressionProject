package expressionproject.starter;

import expressionproject.service.ExpressionService;
import expressionproject.service.impl.ExpressionServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class Runner {

    public static void main(String[] args) {
        ExpressionService expressionService = new ExpressionServiceImpl();

        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(ExpressionService.class);
        factory.setAddress("http://localhost:9000/ExpressionProject");
        factory.setServiceBean(expressionService);
//        factory.set
        factory.create();

        System.out.println("Server ready...");
    }
}
