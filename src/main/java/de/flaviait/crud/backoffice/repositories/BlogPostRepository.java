package de.flaviait.crud.backoffice.repositories;

import de.flaviait.crud.backoffice.models.BlogPostDTO;
import de.flaviait.crud.jooq.tables.records.BlogPostRecord;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

import static de.flaviait.crud.jooq.tables.BlogPost.BLOG_POST;

@Component
public class BlogPostRepository extends AbstractCRUDRepository<BlogPostRecord, Long, BlogPostDTO> {

  @Autowired
  public BlogPostRepository(DSLContext dslContext) {
    super(dslContext, BLOG_POST, BLOG_POST.ID, BlogPostDTO.class);
  }

}
