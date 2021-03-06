package com.damdev.blogapi.service;

import com.damdev.blogapi.domain.Posts;
import com.damdev.blogapi.param.PostsParam;
import org.springframework.data.domain.Page;
import org.springframework.security.core.Authentication;

/**
 * Author : zenic
 * Created : 03/11/2018
 */
public interface PostsService {

  void regPost(Authentication authentication, PostsParam postsParam);

  Page<Posts> getPosts(PostsParam postsParam);

  void updatePost(Authentication authentication, PostsParam postsParam);

  void deletePost(Authentication authentication, PostsParam postsParam);
}
