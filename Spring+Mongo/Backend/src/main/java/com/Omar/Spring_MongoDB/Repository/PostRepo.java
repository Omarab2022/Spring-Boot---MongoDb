package com.Omar.Spring_MongoDB.Repository;

import com.Omar.Spring_MongoDB.Models.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<Post,String> {


}
