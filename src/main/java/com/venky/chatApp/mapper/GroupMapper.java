package com.venky.chatApp.mapper;

import com.venky.chatApp.db.dto.GroupDTO;
import com.venky.chatApp.db.entity.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GroupMapper {

    @Autowired
    private UserMapper userMapper;

    public GroupDTO toDTO(Group group) {
        GroupDTO groupDTO = new GroupDTO();
        groupDTO.setGroupName(group.getGroupName());
        groupDTO.setGroupAdmin(userMapper.toDTO(group.getGroupAdmin()));
        groupDTO.setCreatedAt(group.getCreatedAt());
        groupDTO.setUpdatedAt(group.getUpdatedAt());
        return groupDTO;
    }

    public Group toEntity(GroupDTO groupDTO) {
        Group group = new Group();
        group.setGroupName(groupDTO.getGroupName());
        group.setGroupAdmin(userMapper.toEntity(groupDTO.getGroupAdmin()));
        group.setCreatedAt(groupDTO.getCreatedAt());
        group.setUpdatedAt(groupDTO.getUpdatedAt());
        return group;
    }

}
