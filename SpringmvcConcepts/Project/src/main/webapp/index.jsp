<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ"
	crossorigin="anonymous">
<style>
body {
	font-family: Arial, Helvetica, sans-serif;
}

* {
	box-sizing: border-box;
}

input[type=text], select, textarea {
	width: 100%;
	padding: 12px;
	border: 1px solid green;
	border-radius: 4px;
	box-sizing: border-box;
	margin-top: 6px;
	margin-bottom: 16px;
	resize: vertical;
}

input[type=submit] {
	background-color: #04AA6D;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
}

input[type=submit]:hover {
	background-color: #45a049;
}

.container {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
}
</style>
</head>
<body>

	<h3>Contact Form</h3>
	<!-- <div class="shadow-lg p-3 mb-5 bg-white rounded"> -->
		<div class="shadow-lg p-3 mb-5 bg-white rounded" style="float: left;border-radius: 140px;">
		<form action="/action_page.php">
			<label for="fname">First Name</label> <input type="text" id="fname"
				name="firstname" placeholder="Your name.."> <label
				for="lname">Last Name</label> <input type="text" id="lname"
				name="lastname" placeholder="Your last name.."> <label
				for="lname"> Phone Number</label> <input type="text" id="phno"
				name="lastname" placeholder="Phone Number"><br> <label
				for="state">State</label> <select id="state" name="state">
				<option value="Andhra Pradesh">Andhra Pradesh</option>
				<option value="Arunachal Pradesh">Arunachal Pradesh</option>
				<option value="Bihar">Bihar</option>
				<option value="Chhattisgarh">Chhattisgarh</option>
				<option value="Goa">Goa</option>
				<option value="Gujarat">Gujarat</option>
				<option value="Haryana">Haryana</option>
				<option value="Himachal Pradesh	">Himachal Pradesh</option>
				<option value="Jharkhand">Jharkhand</option>
				<option value="Karnataka">Karnataka</option>
				<option value="Kerala">Kerala</option>
				<option value="Madhya Pradesh	">Madhya Pradesh</option>
				<option value="Maharashtra">Maharashtra</option>
				<option value="Manipur">Manipur</option>
				<option value="Meghalaya">Meghalaya</option>
				<option value="Mizoram">Mizoram</option>
				<option value="Nagaland">Nagaland</option>
				<option value="Odisha">Odisha</option>
				<option value="Punjab">Punjab</option>
				<option value="Rajasthan">Rajasthan</option>
				<option value="Sikkim">Sikkim</option>
				<option value="Tamil Nadu	">Tamil Nadu</option>
				<option value="Telangana">Telangana</option>
				<option value="Tripura">Tripura</option>
				<option value="Uttar Pradesh	">Uttar Pradesh</option>
				<option value="Uttarakhand">Uttarakhand</option>
				<option value="West Bengal	">West Bengal</option>

			</select> <label for="subject">Address</label>

			<textarea id="subject" name="subject" placeholder="Address Details"
				style="height: 100px"></textarea>

			<label for="lname">Upload Resume</label><br> <br> <input
				type="file" id="phno" name="lastname" placeholder="Phone Number"><br>
			<br> <input type="submit" value="Submit">
		</form>
	</div>

</body>
</html>





<!-- 


<div class="reset_base__4w7k30 knox-reset" role="form"
	aria-label="Create an account">
	<div class="reset_base__4w7k30 section knox-reset">
		<label for="user-name">Name</label><input autocapitalize="words"
			autocomplete="name" autocorrect="off" class="" id="user-name"
			maxlength="51" spellcheck="false" type="text" value="">
	</div>
	<div class="reset_base__4w7k30 section knox-reset">
		<label for="email">Email address</label><input autocapitalize="none"
			autocomplete="email" autocorrect="off" class="" id="email"
			maxlength="255" spellcheck="false" type="email" value="">
	</div>
	<div class="reset_base__4w7k30 section box promo-box red knox-reset">
		<span class="promo-code">SWITCH50</span>
		<div class="reset_base__4w7k30 promo-message knox-reset">
			<span
				class="reset_base__4w7k30 sprinkles_color_textNeutralDefault__6fbxlg1ca sprinkles_lineHeight_lineHeightDefault__6fbxlg1fr sprinkles_fontWeight_fontWeightBodyDefault__6fbxlg1fe text_text__thmd26b text_text_variant_large__thmd26k sprinkles_textAlign_start_xs__6fbxlg15o sprinkles_wordBreak_inherit__6fbxlg1f8 text_text_truncate_false__thmd26r knox-reset">This
				promotion has expired.</span>
		</div>
	</div>
	<div
		class="reset_base__4w7k30 section newsletter--index_e4j3I knox-reset">
		<div class="reset_base__4w7k30 knox-reset">
			<input type="checkbox" id="newsletter">
		</div>
		<label for="newsletter">Get emails from 1Password with our
			latest announcements, product updates, advice, events, and research
			opportunities. <a
			href="https://www.1password.co/email-preferences.html"
			target="_blank" rel="noreferrer">Unsubscribe</a> any time.
		</label>
	</div>
	<button id="submit" class="next-button--index_sCs0T new-button blue"
		aria-describedby="terms-and-conditions">Create Account</button>
	<p id="terms-and-conditions" class="terms--index_oT7rh">
		By proceeding, you agree to the <a target="_blank" rel="noreferrer"
			href="https://1password.com/legal/terms-of-service/">Terms of
			Service</a> and <a target="_blank" rel="noreferrer"
			href="https://1password.com/legal/privacy/">Privacy Notice</a>.
	</p>
</div>










































<div class="shadow-none p-3 mb-5 bg-light rounded">No shadow</div>
<div class="shadow-sm p-3 mb-5 bg-white rounded">Small shadow</div>
<div class="shadow p-3 mb-5 bg-white rounded">Regular shadow</div>
<div class="shadow-lg p-3 mb-5 bg-white rounded">Larger shadow</div>
 -->