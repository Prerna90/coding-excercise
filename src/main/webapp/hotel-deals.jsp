<div class="header">
	<div class="container">
			<div  id="top" class="callbacks_container">
				<ul class="rslides" id="slider3">
					<li>
						<div class="head-info">
							<h1>Expedia</span></h1>
						</div>
					</li>
				</ul>
			</div>
	</div>
</div>

<div class="banner-grids">
	<div class="container">
		<div class="banner-grid-info">
			<h3>TOP HOTEL DEALS</h3>
		</div>
		
		<div class="top-grids">
			<span ng-repeat="hotelDeal in hotelDeals">
				<div class="top-grid">
					<img ng-src="{{hotelDeal.imageUrl}}" alt="" />
					<div class="top-grid-info">
						<h3> {{ hotelDeal.destination }}</h3>
						<h4> {{ hotelDeal.name }}</h4>
						<p> {{ hotelDeal.description }}</p>
						<p> Package charges : {{ hotelDeal.totalRate }} USD</p>
						<p> Duration : {{ hotelDeal.lengthofStay }} days</p>
						
					</div>
				</div>
			</span>
		</div>
		
	</div>
</div>

<div class="footer">
	<div class="container">
		<div class="footer-right">
			<div class="footer-nav">
				<ul>
					<li><a href="">HOME</a></li>                                                  
					<li><a href="">ABOUT</a></li>  
					<li><a href="">BOOKING</a></li>  
					<li><a href="">NEWS</a></li>  
					<li><a href="">MAIL US</a></li>  
				</ul>
			</div>
		</div>
	</div>
</div>

