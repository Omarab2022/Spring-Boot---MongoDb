package com.Omar.Spring_MongoDB.Controllers;


import com.Omar.Spring_MongoDB.Models.Post;
import com.Omar.Spring_MongoDB.Repository.PostRepo;
import com.Omar.Spring_MongoDB.Repository.SearchRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {

	@Autowired
	PostRepo postRepo ;

	@Autowired
	SearchRepo searchRepo;
	@GetMapping("/Posts")
	public List<Post> getAllPosts(){
		return postRepo.findAll();
	}

	@PostMapping("/post")
	public Post addpost(@RequestBody Post post){
		return postRepo.save(post);
	}

	@GetMapping("/Posts/{text}")
	public List<Post> search(@PathVariable String text){

		return searchRepo.findByText(text);
	}

}
