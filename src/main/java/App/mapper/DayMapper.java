package App.mapper;

import App.domain.Day;
import App.dto.DayDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface DayMapper {

    DayDto dayToDto(Day day);
    Day dtoToDay(DayDto dayDto);
    List<DayDto> dayToDto(List<Day> days);
    List<Day> dtoToDay(List<Day> days);
}
