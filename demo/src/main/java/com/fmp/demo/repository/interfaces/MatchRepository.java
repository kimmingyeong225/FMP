package com.fmp.demo.repository.interfaces;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.fmp.demo.dto.MatchDTO;

// 매칭 인터페이스
// 생성(저장), 조회, 업데이트(상태변경), 삭제(매칭 종료)
@Mapper
public interface MatchRepository {
	
	 // 1. 매칭 생성(저장)
    int createMatch(MatchDTO matchDTO);

    // 2. 매칭 단건 조회
    MatchDTO getMatchById(Long matchId);

    // 3. 내 매칭 전체 조회 (userId 기준)
    List<MatchDTO> getMatchesByUserId(String userId);

    // 4. 매칭 상태 변경(업데이트)
    int updateMatchStatus(Long matchId, String status);

    // 5. 매칭 삭제(종료)
    int deleteMatch(Long matchId);

}
