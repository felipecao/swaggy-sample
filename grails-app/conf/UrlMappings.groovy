class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/persons"(resources:'person')
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
