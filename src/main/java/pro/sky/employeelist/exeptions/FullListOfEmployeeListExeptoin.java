package pro.sky.employeelist.exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
public class FullListOfEmployeeListExeptoin extends RuntimeException {
}
