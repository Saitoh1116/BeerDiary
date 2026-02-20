import React from "react"

type Beer = {
  id: number
  name: string
  brewery: string
  rating: number
  imageUrl: string
  comment: string
}

type Props = {
  beer: Beer
}

export default function BeerCard({ beer }: Props){
  return(

    <div style={cardStyle}>
      <img
        src={beer.imageUrl}
        alt={beer.name}
        style={imageStyle}
      />

      <h2 style={{ margin: "12px 0 4px"}}>
        {beer.name}
      </h2>

      <p style={{ margin: "0 0 4px", color: "#666" }}> 
        {beer.brewery}
      </p>

      <p style={{margin: "0 0 8px"}}>
        {beer.rating} / 5
      </p>
      
      <p style={{ margin: 0 }}>
        {beer.comment}
      </p>
    </div>
  )
}

const cardStyle: React.CSSProperties = {
  border: "1px solid #ddd",
  borderRadius: "12px",
  padding: "16px",
  marginBottom: "16px",
  maxWidth: "400px",
  backgroundColor: "#fff",
  boxShadow: "0 4px 12px rgba(0,0,0,0.25)"
}

const imageStyle: React.CSSProperties = {
  width: "100%",
  borderRadius: "8px",
  objectFit: "cover"
}

