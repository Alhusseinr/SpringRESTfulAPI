package payroll.order;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import payroll.employee.EmployeeNotFoundException;

public class OrderNotFoundExceptionAdvice {

    @ResponseBody
    @ExceptionHandler(OrderNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String orderNotFoundHandler(EmployeeNotFoundException ex) {
        return ex.getMessage();
    }
}
