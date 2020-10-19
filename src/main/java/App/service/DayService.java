package App.service;

import App.dto.DayDto;
import App.mapper.DayMapper;
import App.repository.DayRepository;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.List;

@Service
@RequiredArgsConstructor
public class DayService {
    private final DayRepository dayRepository;
    private final DayMapper dayMapper = Mappers.getMapper(DayMapper.class);

    public static void updateDay(List<DayDto> dayDtos) {
    }

    public DayDto create(DayDto newDto) {
        return dayMapper.dayToDto(
                dayRepository.save(dayMapper.dtoToDay(newDto))
        );
    }

    public DayDto show() {
        return null;
    }

    public void deleteById(BigInteger id) {
    }
}
