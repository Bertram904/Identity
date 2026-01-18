package com.tuananh.authenticate.controller;

import com.tuananh.authenticate.dto.request.ApiResponse;
import com.tuananh.authenticate.dto.request.PermissionRequest;
import com.tuananh.authenticate.dto.response.PermissionResponse;
import com.tuananh.authenticate.entity.Permission;
import com.tuananh.authenticate.service.PermissionService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/permissions")
public class PermissionController {
    PermissionService  permissionService;

    @PostMapping
    ApiResponse<PermissionResponse> create(@RequestBody PermissionRequest request){
        return ApiResponse.<PermissionResponse>builder()
                .result(permissionService.create(request))
                .build();
    }

    @GetMapping
    ApiResponse<List<PermissionResponse>> getAlls(){
        return ApiResponse.<List<PermissionResponse>>builder()
                .result(permissionService.getAlls())
                .build();
    }

    @DeleteMapping({"/{permissions}"})
    ApiResponse<Void> delete(@PathVariable Permission permissions){
        permissionService.delete(permissions);
        return ApiResponse.<Void>builder().build();
    }
}
