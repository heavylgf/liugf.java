package com.zhss.oa.auth.mapper;

import com.zhss.oa.auth.model.Authorization;

public interface AuthorizationMapper {

    public void authorize(Authorization auth);

    public void unauthorize(Long id);

    public Authorization findById(Long id);

}
