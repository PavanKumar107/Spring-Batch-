package com.blz.candidatespringbatch.repository;
import com.blz.candidatespringbatch.model.CandidateModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository  extends JpaRepository<CandidateModel,Long> {
}