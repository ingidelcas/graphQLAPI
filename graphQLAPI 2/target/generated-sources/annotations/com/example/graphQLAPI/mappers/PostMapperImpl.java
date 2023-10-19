package com.example.graphQLAPI.mappers;

import com.example.graphQLAPI.entities.Post;
import com.example.graphQLAPI.graphql.objects.input.PostInput;
import com.example.graphQLAPI.graphql.objects.type.PostDTO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-16T19:06:48-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2.1 (Eclipse Adoptium)"
)
public class PostMapperImpl implements PostMapper {

    @Override
    public Post toEntity(PostDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Post.PostBuilder post = Post.builder();

        post.id( dto.getId() );
        post.post( dto.getPost() );
        post.userId( dto.getUserId() );
        post.publishDate( dto.getPublishDate() );

        return post.build();
    }

    @Override
    public PostDTO toDTO(Post entity) {
        if ( entity == null ) {
            return null;
        }

        Integer id = null;
        String post = null;
        Integer userId = null;
        LocalDate publishDate = null;

        id = entity.getId();
        post = entity.getPost();
        userId = entity.getUserId();
        publishDate = entity.getPublishDate();

        PostDTO postDTO = new PostDTO( id, post, userId, publishDate );

        return postDTO;
    }

    @Override
    public List<Post> toEntity(List<PostDTO> dto) {
        if ( dto == null ) {
            return null;
        }

        List<Post> list = new ArrayList<Post>( dto.size() );
        for ( PostDTO postDTO : dto ) {
            list.add( toEntity( postDTO ) );
        }

        return list;
    }

    @Override
    public List<PostDTO> toDTO(List<Post> posts) {
        if ( posts == null ) {
            return null;
        }

        List<PostDTO> list = new ArrayList<PostDTO>( posts.size() );
        for ( Post post : posts ) {
            list.add( toDTO( post ) );
        }

        return list;
    }

    @Override
    public Post inputToEntity(PostInput input) {
        if ( input == null ) {
            return null;
        }

        Post.PostBuilder post = Post.builder();

        post.post( input.getPost() );
        post.userId( input.getUserId() );

        return post.build();
    }
}
