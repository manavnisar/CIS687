package org.syr.cis687.repository;

import org.springframework.data.repository.CrudRepository;
import org.syr.cis687.models.Shuttle;

public interface ShuttleRepository extends CrudRepository<Shuttle, Long> {
}
