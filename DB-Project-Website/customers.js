let customers = [];

async function init(){
  let link = "https://legendary-disco-g4r45r5vqxj4f97wx-8500.app.github.dev";
  let response = await fetch(link + "/customers");
  customers = await response.json();
  generateCards(customers);
}

function generateCards(items){
  let html = "";
  for(let i = 0; i < items.length; i++){
    let person = items[i];
    let img = person["Image ID"] || "https://via.placeholder.com/200?text=No+Image";
    let fullName = person.CustomerFirstName + " " + person.CustomerLastName;
    html += "<div class='card'>";
    html += "<div class='cardImage'><img src='" + img + "' alt='" + fullName + "'></div>";
    html += "<div class='cardContent'>";
    html += "<h3 class='cardTitle'>" + fullName + "</h3>";
    html += "<p class='cardInfo'><strong>Name:</strong> " + fullName + "</p>";
    html += "</div></div>";
  }
  
  if(items.length === 0) {
    html = "<p style='text-align: center; padding: 20px; width: 100%;'>No customers found</p>";
  }
  
  document.getElementById("mainpanel").innerHTML = html;
}

function filter(){
  let searchTerm = document.getElementById("customername").value.toLowerCase();
  let results = [];
  
  for(let i = 0; i < customers.length; i++){
    let cust = customers[i];
    let fullName = (cust.CustomerFirstName + " " + cust.CustomerLastName).toLowerCase();
    if(fullName.includes(searchTerm)) {
      results.push(cust);
    }
  }
  generateCards(results);
}