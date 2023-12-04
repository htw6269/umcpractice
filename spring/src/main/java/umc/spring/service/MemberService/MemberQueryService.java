package umc.spring.service.MemberService;

import org.springframework.data.domain.Page;
import umc.spring.domain.Member;
import umc.spring.domain.Review;
import umc.spring.domain.mapping.MemberMission;

import java.util.Optional;

public interface MemberQueryService {

    Optional<Member> findMember(Long id);
    Page<Review> getReviewList(Long StoreId, Integer page);
    Page<MemberMission> getMemberMissionList(Long StoreId, Integer page);

}