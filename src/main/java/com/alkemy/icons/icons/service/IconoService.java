package com.alkemy.icons.icons.service;

import com.alkemy.icons.icons.dto.IconoDTO;

import java.util.List;

public interface IconoService {

    IconoDTO save (IconoDTO dto);

    List<IconoDTO>getAllIconos();

    void delete(Long id);
}
