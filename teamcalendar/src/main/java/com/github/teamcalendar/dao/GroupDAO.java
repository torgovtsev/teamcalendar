package com.github.teamcalendar.dao;

import java.util.List;
import java.util.Set;

import com.github.teamcalendar.middleware.dto.Group;
import com.github.teamcalendar.middleware.dto.User;

public interface GroupDAO
{

    void addGroup(Group group);

    void updateRole(Group group);

    void deleteRole(Group group);

    List<Group> getAllGroup();

    Group getGroupById(Integer id);

    Group getGroupByName(String name);

    Set<Group> getGroupForUser(User user);

    void updateGroupForUser(User user, List<Group> userGroups);

}
