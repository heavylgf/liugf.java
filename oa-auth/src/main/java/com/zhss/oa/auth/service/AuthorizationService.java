package com.zhss.oa.auth.service;

import com.zhss.oa.auth.model.Authorization;

public interface AuthorizationService {

    public void authorize(Authorization auth);

    public void unauthorize(Long id);

    public Authorization findById(Long id);

}
