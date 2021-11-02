package com.alkemy.icons.icons.service.implemen;

import com.alkemy.icons.icons.dto.ContinenteDTO;
import com.alkemy.icons.icons.dto.IconoDTO;
import com.alkemy.icons.icons.entidades.ContinenteEntity;
import com.alkemy.icons.icons.entidades.IconoEntity;
import com.alkemy.icons.icons.mapper.IconoMapper;
import com.alkemy.icons.icons.repository.IconoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.alkemy.icons.icons.service.IconoService;

import java.util.List;


@Service
public class IconoServiceImple implements IconoService {

    @Autowired
    private IconoMapper iconoMapper;
    @Autowired
    private IconoRepository iconoRepository;

    public void delete(Long id) {
        this.iconoRepository.deleteById(id);
    }

    public IconoDTO save(IconoDTO dto){
        IconoEntity entity = iconoMapper.iconoDTO2Entity(dto);
        IconoEntity entitySaved = iconoRepository.save(entity);
        IconoDTO result = iconoMapper.iconoEntity2DTO(entitySaved);
        return result;
    }

    public List<IconoDTO> getAllIconos() {
        List<IconoEntity> entities = iconoRepository.findAll();
        List<IconoDTO> result = iconoMapper.iconoEntityList2DTOList(entities);
        return result;
    }
}

