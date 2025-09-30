import { createClient } from '@supabase/supabase-js'
import express from 'express'

const supabase = createClient('https://uapxzqjlkegnavvlbngg.supabase.co', 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InVhcHh6cWpsa2VnbmF2dmxibmdnIiwicm9sZSI6ImFub24iLCJpYXQiOjE3NTkyMDI4NzAsImV4cCI6MjA3NDc3ODg3MH0.4HygihZ9fIcxlPx7BgBE6fnom2X0A5eNmwAElKuvHac')

const app = express()
app.use(express.json()) //middleware to parse JSON request bodies

app.post('/RegisterPage', async (req, res) => { //registers the user
    const { name, email, address, password } = req.body //extract user details from request body
    if (!name || !email || !address || !password) { //if any field is missing, return error
        return res.status(400).json({ error: 'Missing fields' })
    }
    const { data, error } = await supabase //basic insert query to add user to 'users' table
        .from('users')
        .insert([{ name, email, address, password }])
    if (error) {
        return res.status(500).json({ error: error.message })
    }
    res.status(200).json({ success: true, data })
})

app.listen(3000, () => { //starts server
    console.log('Server running on http://localhost:3000')
})