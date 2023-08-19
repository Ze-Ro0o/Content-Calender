package zero.contentcalender.repository;

import org.springframework.data.repository.ListCrudRepository;
import zero.contentcalender.model.Content;

import java.util.List;

public interface ContentRepository extends ListCrudRepository<Content,Integer> {
    List<Content> findAllByTitleContains(String Keyword);
}
