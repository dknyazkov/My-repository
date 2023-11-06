package com.example.lesson50_.domain;

import com.example.lesson50_.domain.PermissionsEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "Person")
public class PersonEntity implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private Boolean isEnabled;
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<PermissionsEntity> permissions;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<PermissionsEntity> list = getPermissions();
        if (list==null||list.size()==0)
        {return new ArrayList<>();}

        List<GrantedAuthority> collect = list.stream()
                .map(PermissionsEntity::getName)
                .map(name -> new GrantedAuthority() {
                    @Override
                    public String getAuthority() {
                        return name;
                    }
                })
                .collect(Collectors.toList());
        return collect;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
}
