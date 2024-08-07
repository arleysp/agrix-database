package com.betrybe.agrix.ebytr.staff.controller.dto;

import com.betrybe.agrix.ebytr.staff.entity.Person;
import com.betrybe.agrix.ebytr.staff.security.Role;
import org.springframework.security.core.parameters.P;

/**
 * The type Person creation dto.
 */
public record PersonCreationDto(
    String username,
    String password,
    Role role
) {

  /**
   * To entity person.
   *
   * @return the person
   */
  public Person toEntity() {
    Person person = new Person();

    person.setUsername(username);
    person.setPassword(password);
    person.setRole(role);

    return person;
  }
}
