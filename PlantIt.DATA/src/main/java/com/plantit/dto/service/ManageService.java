package com.plantit.dto.service;

import com.plantit.dal.entities.Manage;

import java.util.List;

public interface ManageService {

    Manage saveManage(Manage m);
    Manage updateManage(Manage m);
    void deleteManage(Manage m);
    void deleteManageById(Long id);
    Manage getManage(Long id);
    List<Manage> getAllManages();

}
