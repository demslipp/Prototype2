package App.controller;

import App.domain.Day;
import App.dto.DayDto;
import App.service.DayService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.math.BigInteger;
import java.util.List;

@RestController
@RequestMapping("/day")
@RequiredArgsConstructor
public class DayController {

    private final DayService dayService;

    @PostMapping("/create")
    @ResponseStatus(code = HttpStatus.CREATED)
    @ResponseBody
    public DayDto create(@Validated @RequestBody DayDto dayDto) {
        return dayService.create(dayDto);
    }

    @GetMapping("/show")
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    @ResponseBody
    public DayDto show() {
        return dayService.show();
    }

    @PutMapping("/update")
    public void updateDay(@Validated @RequestBody List<DayDto> dayDtos) {
        DayService.updateDay(dayDtos);
    }

    @DeleteMapping("/delete")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void deleteDay(@PathParam("id") BigInteger id) {
        dayService.deleteById(id);
    }
}
