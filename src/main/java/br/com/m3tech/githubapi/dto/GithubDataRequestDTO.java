package br.com.m3tech.githubapi.dto;

public class GithubDataRequestDTO {

	private String login;
	private Long id;
	private String avatar_url;
	private String url;
	private String html_url;
	private String followers_url;
	private String following_url;
	private String gists_url;
	private String starred_url;
	private String subscriptions_url;
	private String organizations_url;
	private String repos_url;
	private String events_url;
	private String received_events_url;
	private String type;
	private Boolean site_admin;
	private String name;
	private String company;
	private String blog;
	private String location;
	private String email;
	private String hireable;
	private String bio;
	private String twitter_username;
	private Long public_repos;
	private Long public_gists;
	private Long followers;
	private Long following;
	private String created_at;
	private String updated_at;
	
	
	public GithubDataRequestDTO(String login, Long id, String avatar_url, String url, String html_url,
			String followers_url, String following_url, String gists_url, String starred_url, String subscriptions_url,
			String organizations_url, String repos_url, String events_url, String received_events_url, String type,
			Boolean site_admin, String name, String company, String blog, String location, String email,
			String hireable, String bio, String twitter_username, Long public_repos, Long public_gists, Long followers,
			Long following, String created_at, String updated_at) {
		super();
		this.login = login;
		this.id = id;
		this.avatar_url = avatar_url;
		this.url = url;
		this.html_url = html_url;
		this.followers_url = followers_url;
		this.following_url = following_url;
		this.gists_url = gists_url;
		this.starred_url = starred_url;
		this.subscriptions_url = subscriptions_url;
		this.organizations_url = organizations_url;
		this.repos_url = repos_url;
		this.events_url = events_url;
		this.received_events_url = received_events_url;
		this.type = type;
		this.site_admin = site_admin;
		this.name = name;
		this.company = company;
		this.blog = blog;
		this.location = location;
		this.email = email;
		this.hireable = hireable;
		this.bio = bio;
		this.twitter_username = twitter_username;
		this.public_repos = public_repos;
		this.public_gists = public_gists;
		this.followers = followers;
		this.following = following;
		this.created_at = created_at;
		this.updated_at = updated_at;
	}


	public String getLogin() {
		return login;
	}


	public Long getId() {
		return id;
	}


	public String getAvatar_url() {
		return avatar_url;
	}


	public String getUrl() {
		return url;
	}


	public String getHtml_url() {
		return html_url;
	}


	public String getFollowers_url() {
		return followers_url;
	}


	public String getFollowing_url() {
		return following_url;
	}


	public String getGists_url() {
		return gists_url;
	}


	public String getStarred_url() {
		return starred_url;
	}


	public String getSubscriptions_url() {
		return subscriptions_url;
	}


	public String getOrganizations_url() {
		return organizations_url;
	}


	public String getRepos_url() {
		return repos_url;
	}


	public String getEvents_url() {
		return events_url;
	}


	public String getReceived_events_url() {
		return received_events_url;
	}


	public String getType() {
		return type;
	}


	public Boolean getSite_admin() {
		return site_admin;
	}


	public String getName() {
		return name;
	}


	public String getCompany() {
		return company;
	}


	public String getBlog() {
		return blog;
	}


	public String getLocation() {
		return location;
	}


	public String getEmail() {
		return email;
	}


	public String getHireable() {
		return hireable;
	}


	public String getBio() {
		return bio;
	}


	public String getTwitter_username() {
		return twitter_username;
	}


	public Long getPublic_repos() {
		return public_repos;
	}


	public Long getPublic_gists() {
		return public_gists;
	}


	public Long getFollowers() {
		return followers;
	}


	public Long getFollowing() {
		return following;
	}


	public String getCreated_at() {
		return created_at;
	}


	public String getUpdated_at() {
		return updated_at;
	}
	
	
}
