package zero.contentcalender.repository;

import jakarta.annotation.PostConstruct;

import org.springframework.stereotype.Repository;

import zero.contentcalender.model.Content;
import zero.contentcalender.model.Status;
import zero.contentcalender.model.Type;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ContentCollectionRepository {
    private final List<Content> contentList = new ArrayList<>();

    public ContentCollectionRepository() {
    }

    public List<Content> findAll() {
        return contentList;
    }

    public Optional<Content> findById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).findFirst();
    }


    public void save(Content content) {
        contentList.add(content);
    }

    @PostConstruct
    private void init() {
        Content content = new Content(1,
                "My First Blog POst",
                "my first Blog POst",
                Status.IDEA,
                Type.ARTICLE,
                LocalDateTime.now(),
                null,
                "");
        contentList.add(content);
    }


    public boolean existById(Integer id) {
        return contentList.stream().filter(c -> c.id().equals(id)).count() == 1;
    }

    public void update(Content content) {
        contentList.removeIf(c -> c.id().equals(content.id()));
        contentList.add(content);

    }

    public void delete(Integer id) {
        contentList.removeIf(c -> c.id().equals(id));
    }
}
