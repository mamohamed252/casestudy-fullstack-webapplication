<header>
	<nav class="navbar navbar-expand-lg navbar-dark fixed-top  bg-dark">
		<a class="navbar-brand" href="index">Superhero Finder 101</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNav" aria-controls="navbarNav"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item"><a class="nav-link" href="index">Home</a>
				</li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Select </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="addFinding">Add Dynamic Map Finding</a>
						<a class="dropdown-item" href="addFindingStatic">Add Static Findings</a> <a
							class="dropdown-item" href="addLocation"> Add Location</a> <a
							class="dropdown-item" href="addOrg">Add Organization</a> <a
							class="dropdown-item" href="addHero">Add Heroes</a>
					</div>
			</ul>
		</div>
		<h1 class="col-7" class="text-center" style="color:white">Hello ${user.getUserName().toUpperCase()}</h1>
	</nav>
</header>