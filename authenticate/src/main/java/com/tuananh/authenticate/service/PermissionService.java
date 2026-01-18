package com.tuananh.authenticate.service;

import com.tuananh.authenticate.dto.request.PermissionRequest;
import com.tuananh.authenticate.dto.response.PermissionResponse;
import com.tuananh.authenticate.entity.Permission;
import com.tuananh.authenticate.mapper.PermissionMapper;
import com.tuananh.authenticate.repository.PermissionRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class PermissionService {

    PermissionRepository  permissionRepository;
    PermissionMapper  permissionMapper;

    public PermissionResponse create(PermissionRequest request){
        Permission permission = permissionMapper.toPermissionRequest(request);
        permission = permissionRepository.save(permission);
        return permissionMapper.toPermissionResponse(permission);
    }

    public List<PermissionResponse> getAlls() {
        var permissions = permissionRepository.findAll();
        return permissions.stream().map(permissionMapper::toPermissionResponse)
                .toList();
    }
    public void delete(Permission permission){
        permissionRepository.delete(permission);
    }
}
