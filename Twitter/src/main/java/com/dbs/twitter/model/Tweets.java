package com.dbs.twitter.model;

import java.util.List;

import javax.persistence.*;


import lombok.Data;

@Data
@Entity
@Table
public class Tweets {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "tweet", nullable = false)
    private String tweet;
    
//    @Column(name = "media_url", nullable = false)
//    private String mediaUrl;
    
    @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "user_id",nullable = false)
    private User user;

	public Tweets(long id, String tweet) {
		super();
		this.id = id;
		this.tweet = tweet;
	}

	

    


	
//	public Tweets(long id, String tweet, String mediaUrl) {
//		super();
//		this.id = id;
//		this.tweet = tweet;
//		this.mediaUrl = mediaUrl;
//	}

	
    
    
}
