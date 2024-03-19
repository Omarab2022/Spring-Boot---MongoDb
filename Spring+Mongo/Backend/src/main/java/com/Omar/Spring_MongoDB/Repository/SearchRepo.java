package com.Omar.Spring_MongoDB.Repository;

import com.Omar.Spring_MongoDB.Models.Post;

import java.util.List;

public interface SearchRepo {

	List<Post> findByText(String text);
}
