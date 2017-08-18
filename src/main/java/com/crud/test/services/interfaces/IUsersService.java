package com.crud.test.services.interfaces;

import com.crud.test.domain.fostergem.RecentVisitorsDomain;
import com.crud.test.domain.fostergem.UsersDomain;

public interface IUsersService {
    public UsersDomain signup (UsersDomain usersDomain);
    public RecentVisitorsDomain getRecentVisitors(RecentVisitorsDomain recentVisiorsDomain);

    RecentVisitorsDomain saveRecentVisitors(RecentVisitorsDomain recentVisitorsDomain);
}
