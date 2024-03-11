package com.codigo.examen.mapper;

import com.codigo.examen.dto.UsuarioDTO;
import com.codigo.examen.entity.Usuario;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class UsuarioMapper {
    private static final ModelMapper modelMapper = new ModelMapper();

    public UsuarioDTO mapToDto(Usuario entity){
        return modelMapper.map(entity, UsuarioDTO.class);
    }
    public Usuario mapToEntity(UsuarioDTO personaDTO){
        return modelMapper.map(personaDTO, Usuario.class);
    }
}
