package com.tuananh.authenticate.mapper;

import com.tuananh.authenticate.dto.request.PermissionRequest;
import com.tuananh.authenticate.dto.response.PermissionResponse;
import com.tuananh.authenticate.entity.Permission;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermissionRequest(PermissionRequest permission);
    PermissionResponse toPermissionResponse(Permission permissionResponse);
}
