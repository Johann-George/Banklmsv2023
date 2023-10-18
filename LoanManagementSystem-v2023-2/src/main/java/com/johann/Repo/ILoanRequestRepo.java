package com.johann.Repo;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.johann.model.LoanRequest;

@Repository
public interface ILoanRequestRepo extends JpaRepositoryImplementation<LoanRequest,Integer>{
	
	//Find by LoanRequestId
	@Query("from LoanRequest where loanRequestID=?1")
	public LoanRequest findByLoanRequestId(int loanRequestID);
	
	//Update LoanRequest
	@Modifying
    @Query("UPDATE LoanRequest lr SET lr.status.statusId = :statusId WHERE lr.loanRequestID = :loanRequestId")
	Integer updateStatusLoanRequest(@Param("statusId") int statusId, @Param("loanRequestId") int loanRequestId);
	
	//Update LoanRequest
//	@Modifying
//	@Query("update LoanRequest l set l.status=?1 where l.loanRequestID=?2")
//	public LoanRequest updateLoanRequest(int statusID,int loanRequestID);
	
	//Disable LoanRequest
//	@Modifying
//	@Query("update LoanRequest l set l.isSettled=true where l.loanRequestID=?1 ")
//	public void disableLoanReqeust(int loanRequestID);
	
	
}
