let goods, info;

async function init(){
  let link = "https://legendary-disco-g4r45r5vqxj4f97wx-8500.app.github.dev"; //replace with your Dev URL
  let route= "/goods";

  info = await fetch(link+route);
  goods = await info.json();

  generateCards(goods);
}

function generateCards(goods){  
  let output = document.getElementById("centerpanel");
  let build ="";
  
  for(let i=0; i<goods.length; i++){
    let good = goods[i];
    build += `<div class="card" >`
    build += `<h3> Product Name </h3>`;
    build += `<p> ${good.Name}</p>`;
    build += `<div> Expiration Date </div>`;
    build += `<div2> ${good.ExpirationDate} </div2>`;
    build += `<div> Image </div>`;
    build += `<div2> ${good.Image}</div2>`;
    build += `<hr>`;
    build += `</div>`;
  }
  // Now inject the build content into the output container
  output.innerHTML = build;
}

function filter(){
  let name = document.getElementById("customername").value;

  let newCustomers = [];
  
  for(let i=0; i<customers.length;i++){
    let customer = customers[i]
    if( customer.FirstName == name ) {
          newCustomers.push(customer);
       }
  }
  generateCards(newCustomers);  
}