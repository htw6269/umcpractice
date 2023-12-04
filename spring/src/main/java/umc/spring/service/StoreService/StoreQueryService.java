package umc.spring.service.StoreService;
import org.springframework.data.domain.Page;
import umc.spring.domain.Mission;
import umc.spring.domain.Review;
import umc.spring.domain.Store;
import umc.spring.web.dto.StoreSaveResponseDTO;

import java.util.Optional;

public interface StoreQueryService {

    Optional<Store> findStore(Long id);
    Store createStore (Long RegionId, StoreSaveResponseDTO.CreateStoreResultDTO request);
    Page<Review> getReviewList(Long StoreId, Integer page);
    Page<Mission> getMissionList(Long StoreId, Integer page);
}