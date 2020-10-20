package App.mapper;

import App.domain.Day;
import App.dto.DayDto;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-21T00:34:48+0300",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 11.0.8 (JetBrains s.r.o.)"
)
public class DayMapperImpl implements DayMapper {

    @Override
    public DayDto dayToDto(Day day) {
        if ( day == null ) {
            return null;
        }

        DayDto dayDto = new DayDto();

        dayDto.setId( BigInteger.valueOf( day.getId() ) );
        dayDto.setSubjectName( day.getSubjectName() );
        dayDto.setListeners( day.getListeners() );

        return dayDto;
    }

    @Override
    public Day dtoToDay(DayDto dayDto) {
        if ( dayDto == null ) {
            return null;
        }

        Day day = new Day();

        if ( dayDto.getId() != null ) {
            day.setId( dayDto.getId().intValue() );
        }
        day.setSubjectName( dayDto.getSubjectName() );
        day.setListeners( dayDto.getListeners() );

        return day;
    }

    @Override
    public List<DayDto> dayToDto(List<Day> days) {
        if ( days == null ) {
            return null;
        }

        List<DayDto> list = new ArrayList<DayDto>( days.size() );
        for ( Day day : days ) {
            list.add( dayToDto( day ) );
        }

        return list;
    }

    @Override
    public List<Day> dtoToDay(List<Day> days) {
        if ( days == null ) {
            return null;
        }

        List<Day> list = new ArrayList<Day>( days.size() );
        for ( Day day : days ) {
            list.add( day );
        }

        return list;
    }
}
